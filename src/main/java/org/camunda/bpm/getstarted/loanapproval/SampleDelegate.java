package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class SampleDelegate implements JavaDelegate {

    @Autowired
    org.camunda.bpm.getstarted.loanapproval.bean.genderBean genderBean;

    private Expression text1;
    private Expression text2;

    private final static Logger log = Logger.getLogger("Loan Approval");

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String value1 = (String) text1.getValue(execution);
        execution.setVariable("var1", new StringBuffer(value1).reverse().toString());
        log.info("value1 {}" + value1);

        String value2 = (String) text2.getValue(execution);
        execution.setVariable("var2", new StringBuffer(value2).reverse().toString());
        log.info("value2 {}" + value2);

        log.info("Processing request by '"+execution.getVariable("customerId")+"'...");
    }


}
