@configaration




public class Config3 {


    @Value("acccessKey")
    private String accessKey;

    @Value("secretKey")
    private String secretKey;
    
    @Value("")
    private String region;

    public AmersonS3 s3(){
        AWSCredentials awsCredentials =new BasicAwsCredentials(acccessKey,secretKey);
    private String region;
        return AmersonS3ClientBulder.standered.withRegion()
    }
}
