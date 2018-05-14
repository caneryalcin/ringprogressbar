# Ringprogressbar

Bu projedeki amaç seekbardaki değişiklikler ile progressbar da değişimleri gözlemlemek.

---
Aşağıdaki eklentileri ekleyelim...

## build.gradle(Project:ringprogressbar)

allprojects {

    repositories {
    
        google()
        
        jcenter()
        
        maven{url 'https://jitpack.io'}
        
    }
}

## build.gradle(Module:app)

    implementation 'com.github.HotBitmapGG:RingProgressBar:V1.2.2'
    
    


##
Kodları yazdıktan sonra sanal cihazda çalıştırmaya hazır olacaktır.

