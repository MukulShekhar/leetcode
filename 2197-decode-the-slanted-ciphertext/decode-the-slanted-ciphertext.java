class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        int cols=n/rows;
        char[][] mat=new char[rows][cols];
        int ind=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=encodedText.charAt(ind++);
            }
        }
        StringBuilder res=new StringBuilder();
        for(int col=0;col<cols;col++){
            int i=0,j=col;
            while(i<rows && j<cols){
                res.append(mat[i][j]);
                i++;
                j++;
            }
        }
        return res.toString().stripTrailing();
    }
}