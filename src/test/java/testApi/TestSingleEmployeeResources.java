package testApi;

import resources.SingleEmployeeResources;
import org.testng.annotations.Test;

public class TestSingleEmployeeResources extends SingleEmployeeResources {

    @Test
    public void singleValidEmployeeCall(){
        callSingleEmployeeResourcesSuccessStatus();
    }

    @Test
    public void singleInValidEmployeeCall(){
        callSingleEmployeeResourcesFailStatus();
    }
}
