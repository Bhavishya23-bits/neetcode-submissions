class Solution {

    public String encode(List<String> strs) {
        String encoded="";
        for(String a: strs){
            encoded+= a+"`";
        }
        return encoded;

    }

    public List<String> decode(String str) {
        List<String> decode=new ArrayList<>();
        String s="";
        for(char a:str.toCharArray()){
            if(a=='`'){
                decode.add(s);
                s="";
            }
            else{
                s+=a;
            }

        }
        return decode;


    }
}
