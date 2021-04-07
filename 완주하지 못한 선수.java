/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*/

import java.util.Arrays;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        
        String answer="";
        String temp="";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        while(i < completion.length) {
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else {
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else {
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}

// 참가한 선수와 완주한 선수들의 이름을 순서대로 정렬하면 같은 순서로 정렬이 될 것이다. 
// 그 때, 참가한 선수 배열과 완주한 선수 배열 안에서 같은 위치의 두 값이 불일치 하는 경우가 있을 때의 값을 찾아낸다.
