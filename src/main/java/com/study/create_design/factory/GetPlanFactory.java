package com.study.create_design.factory;

public class GetPlanFactory {
    // use getPlan method to get object of type abstract_Plan
    public abstract_Plan getPlan(String planType){
        if (planType == null){
            return null;
        }

        if (planType.equalsIgnoreCase("DOMASTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTI"))
    }
}
