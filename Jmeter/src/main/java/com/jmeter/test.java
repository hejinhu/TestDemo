package com.jmeter;

public class test {

    public static void main(String[] args) {
        //获取返回结果
        String response = prev.getResponseDataAsString(); //获取面前取样器的返回内容
        JSONObject data = new JSONObject(response);//转为JSON格式
        String status = data.get("status").toString();  //取出“status”的值
        String msg = data.get("msg").toString();  //取出“msg”的值

        String fileName = "responsedata.txt"; //根据实际情况修改这个要写入的文件路径
        //写入文件
        public static BufferedWriter WriteFile (String fileName){
            BufferedWriter bufferWriter;
            try {
                File file = new File(fileName);
                if (!file.exists()) {    //如果文件不存在就创建
                    file.createNewFile();
                }
                bufferWriter = new BufferedWriter(new FileWriter(file, true));

            } catch (Exception e) {
                log.info("写入失败");
                bufferWriter = null;
            }

            return bufferWriter;
        }


        try {
            BufferedWriter bf = WriteFile(fileName); //获取bufferedwriter
            if (bf != null) {
                bf.write("{\"status\":\"");  //写入内容
                bf.write(status);
                bf.write("\",\"msg\":\"");
                bf.write(msg + "\"}");
                bf.newLine();           //换行
                bf.flush();
                bf.close();
            }
        } catch (Exception e) {
            bufferWriter.close();
        }
    }
}
