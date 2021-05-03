size(300,600);// 사이즈 설정
background(255);//흰색 배경
for(int i = 5;i < width;i += 10){ // 원 가로로 그리기
  for(int j = 5;j < height / 2;j += 10){ // 원 세로로 그리기
    if(i < width / 2 && j < height/4 && i <= j){
      fill(0, 0, 255, i + j); // 그라데이션 대각선 파랑
    } else if(j < height / 4){
      fill(0, 128, 0, i + j); // 그라데이션 윗 부분에서 남은 부분 초록색 칠하기
    }else if(i > width / 2 && j > height / 4 && i >= j){
      fill(219, 112, 147, i + j); // 그라데이션 대각선 핑크
    } else if(j > height / 4){
      fill(255, 215, 0, i + j); // 그라데이션 아랫부분에서 남은 부분 노란색 칠하기
    }else{
    }
    noStroke(); // 원 윤곽선 없애기
    ellipse(i,j,10,10); // 원 그리기
  }
}

noFill(); // 사각형 채우기 없게 설정
stroke(0); // 사각형 선 색상 조정
int count = 0;
for(int h = 5; h < width; h += 10){ // 사각형 반복문으로 그리기
  count = count + 1; // 색칠변수 + 1
  if(count % 3 == 1){ // 색칠변수 나누기 3의 나머지가 1일 경우 (첫번째)
    stroke(255, 0, 0); // 빨간색
  } else if (count % 3 == 2){ // 색칠변수 나누기 3의 나머지가 2일 경우 (두번째)
    stroke(0, 255, 0); // 초록색
  } else if (count % 3 == 0){ // 색칠변수 나누기 3의 나머지가 0일 경우 (세번째)
    stroke(0, 0, 255); // 파란색
  }
  rect(h, 300 + h, width - 2*h, height / 2 - h * 2); // 사각형의 크기가 점점 작아지도록 설정
}
