# Tts
一行代码搞定语音合成

配置依赖：
 Step 1. Add the JitPack repository to your build file
 Add it in your root build.gradle at the end of repositories:
      
          allprojects {
                repositories {
                      ...
                      maven { url 'https://jitpack.io' }
                }
          }

 Step 2. Add the dependency

          dependencies {
                implementation 'com.github.dingbiye:Tts:v1.0'
          }

先在百度语音官网申请对应的appId，appKey，secretKey等，具体请上百度语音官网查看文档

具体代码中使用：
    
       一行代码实现语音，本语音使用了百度语音
       使用方式：先在百度语音官网申请对应的appId，appKey，secretKey等，具体请上百度语音官网查看文档
       然后在需要的地方初始化该语音库。
       例子：
          //初始化
          String appID = "xxx";
          String appKey = "xx";
          String secretKey = "xx";
          try {
              TtsUtil.getInstance().initialTts(this, appID, appKey, secretKey, TtsMode.MIX);
          } catch (Exception e) {
              e.printStackTrace();
              Log.i("tts", e.getMessage());
          }
          //发声
          try {
              TtsUtil.getInstance().speak("你好，一行实现语音的集成方式来了");
          } catch (Exception e) {
              e.printStackTrace();
              Log.i("tts", e.getMessage());
         }
         //释放
         TtsUtil.getInstance().release();
         
注意事项：
  
 *  先在百度语音官网申请对应的appId，appKey，secretKey等，具体请上百度语音官网查看文档
 *  然后在需要的地方初始化该语音库。
 *  首次使用，需要联网，进行授权文件初始化。
 *  接下来就可以断网使用了，当然联网也可以，不过网络延迟会影响语音的及时性，尤其是弱网，影响可能比较严重
 *  如果想彻底离线使用，请使用百度或讯飞等公司的官方收费包，具体费用请自行查看。
 
 
