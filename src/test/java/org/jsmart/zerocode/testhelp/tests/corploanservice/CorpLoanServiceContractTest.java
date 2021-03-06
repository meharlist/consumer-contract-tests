package org.jsmart.zerocode.testhelp.tests.corploanservice;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.httpclient.ssl.SslTrustHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 *   + Please make sure you have started the `RunMeFirstMockApiServer.java`
 *   + which acts like a fake RESTful server running at localhost exposing the
 *   + API end points used in these examples.
 */

@TargetEnv("corploan_server_host.properties")
@UseHttpClient(SslTrustHttpClient.class)
@RunWith(ZeroCodeUnitRunner.class)
public class CorpLoanServiceContractTest {


    @Test
    @JsonTestCase("contract_tests/corploanservice/create_post_and_get_new_loan.json")
    public void testNewLoan_crudOperations() throws Exception {

    }

    @Test
    @JsonTestCase("contract_tests/corploanservice/amend_put_and_get_existing_loan.json")
    public void tesAmendExistingLoan() throws Exception {

    }

}
