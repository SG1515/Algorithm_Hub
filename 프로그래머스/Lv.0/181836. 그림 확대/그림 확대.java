import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        
        int newRows = rows * k;
        int newCols = cols * k;
        
        String[] newPicture = new String[newRows];
        
        for(int i=0; i<newRows; i++){
            StringBuilder sb = new StringBuilder();
            int row = i / k;
            
            for(int j=0; j<newCols; j++){
                int col = j / k;
                char pixel = picture[row].charAt(col);
                sb.append(pixel);
            }
            
            newPicture[i] = sb.toString();
        }
        return newPicture;
    }
}

/*
주어진 picture 배열의 행과 열의 크기를 계산합니다.
k배로 확장된 새로운 행과 열의 크기를 계산합니다.
newPicture 배열을 새로운 크기로 초기화합니다.
newPicture 배열을 구성하기 위해 반복문을 사용합니다.
i번째 행을 구성하기 위해 row 변수를 계산합니다.
j번째 열을 구성하기 위해 col 변수를 계산합니다.
picture 배열에서 해당 위치의 픽셀을 가져와서 newPicture 배열에 추가합니다.
완성된 newPicture 배열을 반환합니다.*/