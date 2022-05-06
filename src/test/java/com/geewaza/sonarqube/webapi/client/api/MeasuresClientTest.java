package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.ToolMethods;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasures;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 14:42
 **/
public class MeasuresClientTest {

    private static final String SERVER_URL = "http://172.16.21.91:9000/";
    private static final String USER = "welink";
    private static final String PASSWORD = "qwer@1234";
    private static final String TOKEN = "48bd96fe7192f44bbc200123c0f6db9bcfd20a3e";

    @Test
    public void getComponentMeasuresService_01() throws URISyntaxException {
        String project = "we-link";
        List<String> metricKeys = ToolMethods.toStringList("new_technical_debt,blocker_violations,bugs,classes" +
                ",code_smells,cognitive_complexity,comment_lines,comment_lines_density,branch_coverage" +
                ",new_branch_coverage,conditions_to_cover,new_conditions_to_cover,confirmed_issues" +
                ",coverage,new_coverage,critical_violations,complexity,directories,duplicated_blocks" +
                ",new_duplicated_blocks,duplicated_files,duplicated_lines,duplicated_lines_density" +
                ",new_duplicated_lines_density,new_duplicated_lines,effort_to_reach_maintainability_rating_a" +
                ",false_positive_issues,files,functions,generated_lines,generated_ncloc,info_violations,violations" +
                ",line_coverage,new_line_coverage,lines,ncloc,lines_to_cover,new_lines_to_cover,sqale_rating" +
                ",new_maintainability_rating,major_violations,minor_violations,new_blocker_violations,new_bugs" +
                ",new_code_smells,new_critical_violations,new_info_violations,new_violations,new_lines" +
                ",new_major_violations,new_minor_violations,new_security_hotspots,new_vulnerabilities,open_issues" +
                ",projects,alert_status,reliability_rating,new_reliability_rating,reliability_remediation_effort" +
                ",new_reliability_remediation_effort,reopened_issues,security_hotspots,security_hotspots_reviewed" +
                ",new_security_hotspots_reviewed,security_rating,new_security_rating,security_remediation_effort" +
                ",new_security_remediation_effort,security_review_rating,new_security_review_rating,skipped_tests" +
                ",statements,sqale_index,sqale_debt_ratio,new_sqale_debt_ratio,uncovered_conditions" +
                ",new_uncovered_conditions,uncovered_lines,new_uncovered_lines,test_execution_time,test_errors" +
                ",test_failures,tests,test_success_density,vulnerabilities,wont_fix_issues");
        SonarClient sonarClient = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
        ComponentMeasures result = sonarClient.getMeasuresClient().getComponentMeasures()
                .component(project).metricKeys(metricKeys.toArray(new String[]{})).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }



    @Test
    public void getComponentMeasuresService_02() throws URISyntaxException {
        String project = "we-link";
        List<String> metricKeys = ToolMethods.toStringList("new_technical_debt,blocker_violations,bugs,classes" +
                ",code_smells,cognitive_complexity,comment_lines,comment_lines_density,branch_coverage" +
                ",new_branch_coverage,conditions_to_cover,new_conditions_to_cover,confirmed_issues" +
                ",coverage,new_coverage,critical_violations,complexity,directories,duplicated_blocks" +
                ",new_duplicated_blocks,duplicated_files,duplicated_lines,duplicated_lines_density" +
                ",new_duplicated_lines_density,new_duplicated_lines,effort_to_reach_maintainability_rating_a" +
                ",false_positive_issues,files,functions,generated_lines,generated_ncloc,info_violations,violations" +
                ",line_coverage,new_line_coverage,lines,ncloc,lines_to_cover,new_lines_to_cover,sqale_rating" +
                ",new_maintainability_rating,major_violations,minor_violations,new_blocker_violations,new_bugs" +
                ",new_code_smells,new_critical_violations,new_info_violations,new_violations,new_lines" +
                ",new_major_violations,new_minor_violations,new_security_hotspots,new_vulnerabilities,open_issues" +
                ",projects,alert_status,reliability_rating,new_reliability_rating,reliability_remediation_effort" +
                ",new_reliability_remediation_effort,reopened_issues,security_hotspots,security_hotspots_reviewed" +
                ",new_security_hotspots_reviewed,security_rating,new_security_rating,security_remediation_effort" +
                ",new_security_remediation_effort,security_review_rating,new_security_review_rating,skipped_tests" +
                ",statements,sqale_index,sqale_debt_ratio,new_sqale_debt_ratio,uncovered_conditions" +
                ",new_uncovered_conditions,uncovered_lines,new_uncovered_lines,test_execution_time,test_errors" +
                ",test_failures,tests,test_success_density,vulnerabilities,wont_fix_issues");
        SonarClient sonarClient = new SonarClient(new URI(SERVER_URL), TOKEN);
        ComponentMeasures result = sonarClient.getMeasuresClient().getComponentMeasures()
                .component(project).metricKeys(metricKeys.toArray(new String[]{})).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
