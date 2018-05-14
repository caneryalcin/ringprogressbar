# Ringprogressbar

Bu projedeki amaç seekbardaki değişiklikler ile progressbar da değişimleri gözlemlemek.

---
Aşağıdaki eklentileri ekleyelim...

## build.gradle(Project:ringprogressbar)

![](https://im.ezgif.com/tmp/ezgif-1-d3dbec45bd.gif)

allprojects {

    repositories {
    
        google()
        
        jcenter()
        
        maven{url 'https://jitpack.io'}
        
    }
}

## build.gradle(Module:app)

    implementation 'com.github.HotBitmapGG:RingProgressBar:V1.2.2'
    
![](https://im.ezgif.com/tmp/ezgif-1-07a07220ba.gif)
    


##
Kodları yazdıktan sonra sanal cihazda çalıştırmaya hazır olacaktır.

