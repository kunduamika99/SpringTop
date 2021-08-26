//open module provider {
module provider {
    exports com.lti;
//    exports com.lti.util;
    opens com.lti to consumer;
    opens com.lti.util to consumer;

}