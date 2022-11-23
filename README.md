# eBebekTest
Aşağıda belirtilen çalışmaların 3 gün içerisinde tamamlanıp gönderilmesi rica olunur:
# 1. Manuel Test Senaryosu
Sepet sayfasındaki işlemler için işlevsel test senaryoları geliştiriniz.

## 1.Çözüm: LoginTest.java
#### 1.Login sayfası açılır. (www.e-bebek.com/login)
#### 2.Phone Number kısmına tıklanır, "058004634" yazılır, Login butonuna tıklanır. (Phone Number varsayılan 5xx geliyor)
#### 3.Şifre girme alanına tıklanır, "1012O.u.1012" yazılır ve Enter'a basılır. (Login'e tıklanmıyor)
#### 4.Eğer lnkLoginNavNode ekranda bulunamıyorsa (Login Button) giriş yapılmıştır.
#### 5.Test biter, çıktı verir.

# 2. Test Otomasyonu (UI)
## 2.Çözüm: AddToChart.java
Aşağıdaki test senaryosunu Cucumber, Selenium ve istediğiniz programlama dili ile geliştiriniz.
### 1. Ana sayfa açılır. (www.e-bebek.com)
### 2. Arama çubuğuna "biberon" yazılır.
### 3. Arama yapılır.
### 4. İlk ürüne tıklanır.
### 5. "Sepete Ekle" butonuna tıklanır.
### 6. "Sepeti Gör” butonuna tıklanır.
### 7. Ürünün sepete eklendiği kontrol edilir.

# 3. Test Otomasyonu – API
## 3.Çözüm: ApiTest Folder
API isteği sonucunun (HTTP Status Code) kontrolünü gerçekleştiren aşağıdaki test senaryosunu
istediğiniz programlama dili ile geliştiriniz.
Senaryo: Seçilecek birer tane GET ve POST isteği için “HTTP Status Code” 200 (başarılı), değilse
(başarısız) olan test senaryosu. (http://generator.swagger.io)

# 4. Hata Raporlama
## 4.Çözüm: Hata bulunamadı. (Bazı img'lerin alt'ları boş, tek bulabildiğim bu.)
E-Bebek web sitesi ya da mobil uygulamasında en az 2 adet hata bularak standartlara uygun bir
şekilde raporlayınız.

