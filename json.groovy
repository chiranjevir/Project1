void getItemData()
{
    def jsonSlurper = new JsonSlurper()
    def reader = new BufferedReader(new InputStreamReader(new FileInputStream("data.json"),"UTF-8"));
    data = jsonSlurper.parse(reader);       
    data.TESTS.each{println  it.MEMBER_ID}
}

getItemData("MEMBER_ADDRESS")
