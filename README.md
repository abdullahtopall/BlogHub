BlogHub - Spring Boot Blog Uygulaması

📌 Proje Hakkında
BlogHub, Spring Boot ile geliştirilmiş modern bir blog platformudur. Kullanıcıların post paylaşabildiği, yorum yapabildiği ve etkileşimde bulunabildiği bir sosyal içerik platformu sunar.

✨ Özellikler
✅ Kullanıcı kayıt ve giriş sistemi

✅ Post oluşturma, düzenleme ve silme

✅ Postlara yorum yapabilme

✅ Kullanıcı profilleri

✅ Beğeni sistemi

✅ Etiket yönetimi

🛠 Teknoloji
Backend
Spring Boot 3.x

Spring Security - Kimlik doğrulama ve yetkilendirme

Spring Data JPA - Veritabanı erişimi

Hibernate - ORM aracı

MySQL - Veritabanı

Maven - Bağımlılık yönetimi

Frontend
Thymeleaf - Sunucu taraflı template engine

Bootstrap 5 - Responsive tasarım

JavaScript - Dinamik işlevsellik

🚀 Kurulum
Ön Gereksinimler
Java 17+

MySQL 8+

Maven 3.6+

Adım Adım Kurulum
Veritabanı ayarları:

bash
Copy
# MySQL'de veritabanı oluştur
CREATE DATABASE bloghub;
Uygulamayı çalıştırma:

bash
Copy
# Projeyi klonla
git clone https://github.com/abdullahtopall/BlogHub.git
cd BlogHub

# Bağımlılıkları yükle
mvn install

# Uygulamayı başlat
mvn spring-boot:run
Uygulamaya erişim:

Tarayıcıda http://localhost:8080 adresini açın

⚙️ Yapılandırma
application.properties dosyasında aşağıdaki ayarları yapabilirsiniz:

properties
Copy
# Veritabanı ayarları
spring.datasource.url=jdbc:mysql://localhost:3306/bloghub
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA/Hibernate ayarları
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Server ayarları
server.port=8080
🌱 Katkıda Bulunma
Katkılarınızı bekliyoruz! Katkıda bulunmak için:

Fork oluşturun

Yeni bir branch açın (git checkout -b feature/awesome-feature)

Değişikliklerinizi commit edin (git commit -am 'Add awesome feature')

Branch'e push yapın (git push origin feature/awesome-feature)

Pull Request açın

📜 Lisans
Bu proje MIT lisansı altında lisanslanmıştır - detaylar için LICENSE dosyasına bakın.

📞 İletişim
Abdullah Topal

Proje Linki: https://github.com/abdullahtopall/BlogHub
