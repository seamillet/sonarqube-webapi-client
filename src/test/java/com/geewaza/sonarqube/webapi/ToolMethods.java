package com.geewaza.sonarqube.webapi;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


/**
 * @author WangHeng
 * @date 2022-02-23
 */
public class ToolMethods {

    public static final Pattern SPACE_PATTERN = Pattern.compile("\\s*|\t|\r|\n");


    /**
     * 将列表转换成逗号分隔的字符串 如果是字符串元素的 会加上引号
     *
     * @param list
     * @param string
     * @return
     */
    public static String toArrayString(List<? extends Object> list, boolean string) {
        return toArrayString(list, ",", string);
    }

    /**
     * 将列表转换成逗号分隔的字符串 如果是字符串元素的 会加上引号
     *
     * @param list
     * @param string
     * @return
     */
    public static String toArrayString(List<? extends Object> list, String separator, boolean string) {
        return toArrayString(list, separator, string, "\"");
    }

    /**
     * 将列表转换成逗号分隔的字符串 如果是字符串元素的 会加上引号
     *
     * @param list
     * @param string
     * @return
     */
    public static String toArrayString(List<? extends Object> list, String separator, boolean string, String quotation) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(separator);
            }
            if (string) {
                sb.append(quotation).append(list.get(i)).append(quotation);
            } else {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

    /**
     * 将列表按照step指定的每段长度进行切分
     *
     * @param list
     * @param step
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> cutList(List<T> list, int step) {
        if (list == null) {
            return null;
        }
        List<List<T>> resultList = new ArrayList<List<T>>();
        if (list.size() == 0) {
            return resultList;
        }
        if (list.size() <= step) {
            resultList.add(list);
            return resultList;
        }
        int fromIndex = 0;
        int toIndex = fromIndex + step;
        while (fromIndex < list.size()) {
            resultList.add(list.subList(fromIndex, toIndex));
            fromIndex = toIndex;
            toIndex = fromIndex + step;
            if (toIndex > list.size()) {
                toIndex = list.size();
            }
        }
        return resultList;
    }

    public static <T> List<List<T>> cutListBySize(List<T> list, int size) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<List<T>> resultList = new ArrayList<>();
        if (list.size() == 0) {
            return resultList;
        }
        if (size <= 1) {
            resultList.add(list);
            return resultList;
        }

        int step = list.size() / size;
        int plus = list.size() % size;
        if (plus != 0) {
            step++;
        }

        int fromIndex = 0;
        int toIndex = fromIndex + step;
        while (fromIndex < list.size()) {
            resultList.add(list.subList(fromIndex, toIndex));
            fromIndex = toIndex;
            toIndex = fromIndex + step;
            if (toIndex > list.size()) {
                toIndex = list.size();
            }
        }
        return resultList;
    }


    /**
     * 将错误堆栈转成String
     *
     * @param e
     * @return
     * @throws IOException
     */
    public static String getStackTrace(Throwable e) {
        if (e == null) {
            return null;
        }
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            e.printStackTrace(printStream);
            return new String(byteArrayOutputStream.toByteArray());
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }



    public static String getResourceFileContent(String pathName) throws IOException {
        URL url = ToolMethods.class.getClassLoader().getResource(pathName);
        if (url == null) {
            throw new NullPointerException("系统资源:" + pathName + " 未找到!");
        }
        String path = url.getPath();
        return FileUtils.readFileToString(new File(path));
    }

    /**
     * 将字符串按照separator切分并返回切分后的的字符串数组
     *
     * @param value 待切分的字符串
     * @return 字符串数组
     */
    public static List<String> toStringList(String value) {
        return toStringList(value, ",");
    }

    /**
     * 将字符串按照separator切分并返回切分后的的字符串数组
     *
     * @param value     待切分的字符串
     * @param separator 分隔符
     * @return 字符串数组
     */
    public static List<String> toStringList(String value, String separator) {
        List<String> result = new ArrayList<>();
        String[] array = value.split(separator);
        for (String item : array) {
            if (StringUtils.isNotBlank(item)) {
                result.add(item.trim());
            }
        }
        return result;
    }

    /**
     * 创建目录
     *
     * @param dirPath
     */
    public static void buildDirs(String dirPath) {
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    /**
     * 创建新文件，如果该文件不存在 就创建该文件，如果存在，则删除后再创建新文件，
     * 创建的过程中连带目录一起创建
     *
     * @param filePathName
     * @return
     * @throws IOException
     */
    public static File buildNewFile(String filePathName) throws IOException {
        File result = new File(filePathName);
        if (!result.exists()) {
            File parent = result.getParentFile();
            if (!parent.exists()) {
                if (!parent.mkdirs()) {
                    throw new FileNotFoundException("没有找到该文件");
                }
            }
            if (!result.createNewFile()) {
                throw new IOException("创建文件异常");
            }
            return result;
        } else {
            if (!result.delete()) {
                throw new IOException("删除文件异常");
            }
            if (!result.createNewFile()) {
                throw new IOException("创建文件异常");
            }
            return result;
        }
    }

    /**
     * 获取文件名中的扩展名
     *
     * @param fileName
     * @return
     */
    public static String getFileNameSuffix(String fileName) {
        int lastIndex;
        if ((lastIndex = fileName.lastIndexOf('.')) != -1) {
            return fileName.substring(lastIndex + 1);
        } else {
            return null;
        }
    }

    /**
     * 复制文件
     *
     * @param sourceFile
     * @param directFileName
     * @throws IOException
     */
    public static File copyFile(File sourceFile, String directFileName) throws IOException {
        File directFile = buildNewFile(directFileName);
        try (OutputStream outputStream = new FileOutputStream(directFile)) {
            Files.copy(sourceFile.toPath(), outputStream);
            return directFile;
        }
    }


    /**
     * 复制文件
     *
     * @param sourceFile
     * @param orgNamePath
     * @throws IOException
     */
    public static File copyFileRandomName(File sourceFile, String orgNamePath) throws IOException {
        String newName = addRandomCodeIntoFileName(orgNamePath);
        return copyFile(sourceFile, newName);
    }

    public static String addRandomCodeIntoFileName(String orgNamePath) {
        String orgName = orgNamePath.substring(orgNamePath.lastIndexOf('/') + 1);
        String orgPath = orgNamePath.substring(0, orgNamePath.lastIndexOf('/') + 1);
        String randomCode = getRandomCode(8);
        return orgName.lastIndexOf('.') > -1 ?
                (orgPath + orgName.substring(0, orgName.lastIndexOf('.')) + "_" + randomCode + orgName.substring(orgName.lastIndexOf('.'))) :
                (orgPath + orgName + "_" + randomCode);
    }

    public static String getRandomCode(int length) {
        return UUID.randomUUID().toString().substring(0, length);
    }

    /**
     * 获取该文件的行数
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static Long getFileLineCount(File file) throws IOException {
        long fileLength = file.length();
        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file))) {
            lineNumberReader.skip(fileLength);
            long lineNumber = lineNumberReader.getLineNumber();
            lineNumber++;
            return lineNumber;
        }
    }





    /**
     * 判断是否是json结构
     */
    public static boolean isJson(String value) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSON.parse(value);
        } catch (JSONException e) {
            return false;
        }
        return true;
    }


    /**
     * 将orig列表复制size份
     *
     * @param origin  源数据
     * @param several 大小
     * @return {@link List<String>}
     */
    public static List<String> copyData(List<String> origin, Integer several) {
        for (int i = 0; i < several - 1; i++) {
            origin.add(origin.get(0));
        }
        return origin;
    }

    /**
     * 获取在源数据中某标点是否是成对出现
     *
     * @param originData 原数据
     * @return {@link Boolean}
     */
    public static Boolean pairs(String originData, String punctuation) {
        boolean flag = Boolean.TRUE;
        for (String x : originData.split(",")) {
            if (count(x, punctuation) % 2 == 1) {
                flag = Boolean.FALSE;
                break;
            }
        }
        return flag;
    }

    /**
     * 记录一个子串在整串中出现的次数
     *
     * @param origin 源数据
     * @param sub    子串
     * @return {@link int}
     */
    public static int count(String origin, String sub) {
        int count = 0;
        int d = 0;
        while ((d = origin.indexOf(sub, d)) != -1) {
            origin = origin.substring(d + sub.length());
            count++;
        }
        return count;
    }

    public static List<String> getMatchers(String regex, String source) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }


    /**
     * 分割两个字符分割字符串，根据前一个字符的为界分割
     * <p>
     * originData:" '1','b,c,div','c,d,c','$.person[*].position'"
     * <p>
     * preRegex: '   ;  sufRegex: ,
     * <p>
     * result :[ '1', 'b,c,div', 'c,d,c', '$.person[*].position']
     *
     * @param originData 原数据
     * @param preRegex   前缀
     * @param sufRegex   后缀
     * @return {@link String[]}
     */
    public static String[] splitByPreAndSufRegex(String originData, String preRegex, String sufRegex) {
        String[] split = originData.split(preRegex + sufRegex);
        for (int i = 0; i < split.length - 1; i++) {
            split[i] = split[i] + preRegex;
        }
        return split;
    }

    /**
     * 列表数据转置
     *
     * @param originData 源数据
     * @return {@link List<List<String>> } 转换后的值
     */
    public static List<List<String>> transpose(List<List<String>> originData) {
        List<List<String>> lists = new ArrayList<>(originData.get(0).size());
        List<String> list;
        for (int i = 0; i < originData.get(0).size(); i++) {
            list = new ArrayList<>(originData.size());
            for (List<String> resource : originData) {
                list.add(resource.get(i));
            }
            lists.add(list);
        }
        return lists;
    }


//    public static Object parseXml(String body, String expression) {
//        try {
//            Document document = DocumentHelper.parseText(body);
//            Node node = Optional.ofNullable(DocumentContainer.getNodeByPath(document, expression))
//                    .orElseThrow(() -> new ServiceException(ExceptionMessageUtil.setComponentType(ComponentExceptionEnum.SYSTEM
//                            , "值路径传输失败"), CommonErrorCode.PATH_TRANSFER_ERROR));
//            return node.getText().trim();
//        } catch (Exception e) {
//            throw new ServiceException(ExceptionMessageUtil.setComponentType(ComponentExceptionEnum.SYSTEM, "XMLParseManager@getNodeValue: "
//                    + "XPath expression [" + expression + "] error！"), e, CommonErrorCode.PARSE_XML_ERROR);
//        }
//    }


    /**
     * 解析json数据
     *
     * @param path 路径
     * @param body 消息体
     * @return {@link Object}
     */
//    public static Object parseJson(String body, String path) {
//        try {
//            return JsonPath.read(body, path);
//        } catch (Exception exception) {
//            throw new ServiceException(ExceptionMessageUtil.setComponentType(ComponentExceptionEnum.SYSTEM,
//                    "数据解析失败，值路径或数据有误"), CommonErrorCode.PARSE_JSON_ERROR);
//        }
//    }


    /**
     * 去除回车，水平制表符
     *
     * @param str 需要处理的数据
     * @return 处理后的数据
     */
    public static String replaceTab(String str) {
        String dest = "";
        if (str != null) {
            dest = str.replaceAll("(\\t|\\t\\t\\n|\\n)", "");
        }
        return dest;
    }

    /**
     * 去除回车，空格，水平制表符，换行
     *
     * @param str 需要处理的数据
     * @return 处理后的数据
     */
    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Matcher m = SPACE_PATTERN.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    /**
     * 去除jsonType
     *
     * @param str 需要处理的数据
     * @return 处理后的数据
     */
    public static String replaceJsonType(String str) {
        String dest = "";
        if (str != null) {
            dest = str.replace(" __json_type=\"@array\"", "");
        }
        return dest;
    }




    /**
     * 从数据的后面执行一次分割
     *
     * @param data  数据
     * @param regex 分割符
     * @return {@link List< String>}
     */
    public static List<String> reverseSplitOnce(String data, String regex) {
        List<String> splitData = new ArrayList<>();
        int i = data.lastIndexOf(regex);
        if (i == -1) {
            splitData.add(data);
        } else {
            splitData.add(data.substring(0, data.lastIndexOf(regex)));
            String substring = data.substring(data.lastIndexOf(regex));
            splitData.add(substring.split(regex, 2)[1]);
        }
        return splitData;
    }


    /**
     * 符号判断
     *
     * @param ch
     * @return
     */
    static boolean isSymbol(char ch) {
        if (ch == 0x5f) {
            return false;
        }

        if (isCnSymbol(ch)) {
            return true;
        }

        if (isEnSymbol(ch)) {
            return true;
        }

        if (0x2010 <= ch && ch <= 0x2017) {
            return true;
        }

        if (0x2020 <= ch && ch <= 0x2027) {
            return true;
        }

        if (0x2B00 <= ch && ch <= 0x2BFF) {
            return true;
        }

        if (0xFF03 <= ch && ch <= 0xFF06) {
            return true;
        }

        if (0xFF08 <= ch && ch <= 0xFF0B) {
            return true;
        }

        if (ch == 0xFF0D || ch == 0xFF0F) {
            return true;
        }

        if (0xFF1C <= ch && ch <= 0xFF1E) {
            return true;
        }

        if (ch == 0xFF20 || ch == 0xFF65) {
            return true;
        }

        if (0xFF3B <= ch && ch <= 0xFF40) {
            return true;
        }

        if (0xFF5B <= ch && ch <= 0xFF60) {
            return true;
        }

        if (ch == 0xFF62 || ch == 0xFF63) {
            return true;
        }

        return ch == 0x0020 || ch == 0x3000;

    }

    /**
     * 中文符号判断
     *
     * @param ch
     * @return
     */
    static boolean isCnSymbol(char ch) {
        if (0x3004 <= ch && ch <= 0x301C) {
            return true;
        }

        return 0x3020 <= ch && ch <= 0x303F;
    }

    /**
     * 英文符号判断
     *
     * @param ch
     * @return
     */
    static boolean isEnSymbol(char ch) {

        if (ch == 0x40) {
            return true;
        }

        if (ch == 0x2D || ch == 0x2F) {
            return true;
        }

        if (0x23 <= ch && ch <= 0x26) {
            return true;
        }

        if (0x28 <= ch && ch <= 0x2B) {
            return true;
        }

        if (0x3C <= ch && ch <= 0x3E) {
            return true;
        }

        if (0x5B <= ch && ch <= 0x60) {
            return true;
        }

        return 0x7B <= ch && ch <= 0x7E;

    }

    /**
     * 标点符号判断
     *
     * @param ch
     * @return
     */
    static boolean isPunctuation(char ch) {
        if (isCjkPunc(ch)) {
            return true;
        }

        if (isEnPunc(ch)) {
            return true;
        }

        if (0x2018 <= ch && ch <= 0x201F) {
            return true;
        }

        if (ch == 0xFF01 || ch == 0xFF02) {
            return true;
        }

        if (ch == 0xFF07 || ch == 0xFF0C) {
            return true;
        }

        if (ch == 0xFF1A || ch == 0xFF1B) {
            return true;
        }

        if (ch == 0xFF1F || ch == 0xFF61) {
            return true;
        }

        if (ch == 0xFF0E) {
            return true;
        }

        return ch == 0xFF65;

    }

    /**
     * 英文标点判断
     *
     * @param ch
     * @return
     */
    static boolean isEnPunc(char ch) {
        if (0x21 <= ch && ch <= 0x22) {
            return true;
        }

        if (ch == 0x27 || ch == 0x2C) {
            return true;
        }

        if (ch == 0x2E || ch == 0x3A) {
            return true;
        }

        return ch == 0x3B || ch == 0x3F;

    }

    /**
     * 中文标点判断
     *
     * @param ch
     * @return
     */
    static boolean isCjkPunc(char ch) {
        if (0x3001 <= ch && ch <= 0x3003) {
            return true;
        }

        return 0x301D <= ch && ch <= 0x301F;

    }

    public static <T> T getBeanByJSONFile(String fileName, Class<T> clazz) throws Exception {
        File file = getResourceFile(fileName);
        return JSONObject.parseObject(FileUtils.readFileToString(file), clazz);
    }

    public static <T> List<T> getListByJSONFile(String fileName, Class<T> clazz) throws Exception {
        File file = getResourceFile(fileName);
        return JSONObject.parseArray(FileUtils.readFileToString(file), clazz);
    }


    public static File getResourceFile(String pathName) {
        URL url = ToolMethods.class.getClassLoader().getResource(pathName);
        if (url == null) {
            throw new NullPointerException("No file found " + pathName);
        }
        String path = url.getPath();
        return new File(path);
    }

    public static Long timeIntervalToMillis(LocalDateTime from, LocalDateTime to) {
        Duration duration = Duration.between(from, to);
        return duration.toMillis();
    }


}
