class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] video = video_len.split(":");
        Integer mm_len = Integer.valueOf(video[0]);
        Integer ss_len = Integer.valueOf(video[1]);
        String[] now = pos.split(":");
        Integer mm = Integer.valueOf(now[0]);
        Integer ss = Integer.valueOf(now[1]);
        String[] opStart = op_start.split(":");
        Integer startTime = Integer.valueOf(opStart[0])*60+Integer.valueOf(opStart[1]);
        String[] opEnd = op_end.split(":");
        Integer endTime = Integer.valueOf(opEnd[0])*60+Integer.valueOf(opEnd[1]);
        for(String command : commands){
            int time = mm*60+ss;
            if(time >= startTime && time <= endTime){
                mm = Integer.valueOf(opEnd[0]);
                ss = Integer.valueOf(opEnd[1]);
            }
            switch (command){
                case "next":
                    ss +=10;
                    if(mm == mm_len && ss > ss_len){
                        ss = ss_len;
                    } else if(ss >= 60 && mm == mm_len-1){
                        mm++;
                        ss -= 60;
                        if(ss > ss_len)
                            ss = ss_len;
                    } else if(ss >= 60){
                        ss -= 60;
                        mm++;
                    }
                    break;      
                case "prev":
                    ss -=10;
                    if(mm == 0 && ss < 0){
                        ss = 0;
                    } else if(ss < 0){
                        ss += 60;
                        mm--;
                    }
                    break;
            }
            time = mm*60+ss;
            if(time >= startTime && time <= endTime){
                mm = Integer.valueOf(opEnd[0]);
                ss = Integer.valueOf(opEnd[1]);
            }            
        }
        
        String answer = "";
        if(mm < 10){
            answer += "0"+mm;
        } else{
            answer += mm;
        }
        answer += ":";
        if(ss < 10){
            answer += "0"+ss;
        } else{
            answer += ss;
        }
        return answer;
    }
    
}