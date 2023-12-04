public class Main {
    public class Report5 {
        public static void main(String[] args) {
            // 条件1: String型変数 str を宣言し、初期値として null を代入する。
            String str = null;
    
            // 条件2: str.length() の内容を表示しようとする。
            try{
                System.out.println(str.length()); // ここで NullPointerException が発生するはず
            }catch(NullPointerException e){
                //NullPointerExceptionが発生した場合の処理
                System.out.println("NullPointerExceptionが発生しました。"+e.getMessage());
            }
        }
    }
    
}
