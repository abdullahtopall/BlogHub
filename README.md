# BlogHub 📝 - Modern Blog Platformu

![GitHub stars](https://img.shields.io/github/stars/abdullahtopall/BlogHub?style=social)
![GitHub forks](https://img.shields.io/github/forks/abdullahtopall/BlogHub?style=social)
![License](https://img.shields.io/badge/license-MIT-blue)
![Java](https://img.shields.io/badge/Java-Spring_Boot-green)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![React](https://img.shields.io/badge/Frontend-React-61DAFB)

<div align="center">
  <img src="https://i.imgur.com/DRp8Vj0.png" alt="BlogHub Logo" width="300"/>
  <p><em>Düşüncelerinizi özgürce paylaşın!</em></p>
</div>

## 📌 Genel Bakış

**BlogHub**, kullanıcıların düşüncelerini, fikirlerini ve hikayelerini kolayca paylaşabilecekleri modern ve kullanıcı dostu bir blog platformudur. Spring Boot backend ve React frontend teknolojileriyle geliştirilmiş, tam kapsamlı bir MVC mimarisine sahiptir.

### 🌟 Neden BlogHub?

- **Basit ve Güçlü** - Karmaşık ayarlar olmadan blog yazılarınızı hemen oluşturun
- **Etkileşimli** - Beğeniler ve yorumlarla sosyal etkileşim
- **Kategorize** - Yazılarınızı kategorilere ayırarak düzenli tutun
- **Güvenli** - Kullanıcı kimlik doğrulama sistemi

## 🛠️ Teknoloji Yığını

### Backend
- **Java** + **Spring Boot** - Güçlü API altyapısı
- **Spring Data JPA** - Veritabanı işlemleri için
- **MySQL** - Veritabanı sistemi
- **Hibernate** - ORM çözümü

### Frontend
- **React.js** - Kullanıcı arayüzü geliştirme
- **React Hooks** - Durum yönetimi
- **CSS/SCSS** - Stil ve duyarlı tasarım
- **Axios** - API istekleri

## ✨ Özellikler

- 🔐 **Kullanıcı Yönetimi**
  - Kayıt ve giriş sistemi
  - Kullanıcı profili yönetimi

- 📝 **Blog İşlemleri**
  - Blog yazıları oluşturma, okuma, güncelleme ve silme
  - Kategorilere göre filtreleme
  - Markdown destekli zengin içerik

- 💬 **Etkileşim**
  - Yazılara yorum yapma
  - Beğeni/like sistemi
  - Yorum yönetimi

- 📱 **Duyarlı Tasarım**
  - Tüm cihazlarda mükemmel görüntüleme

## 🚀 Kurulum ve Çalıştırma

### Gereksinimler
- Java 11+ 
- Maven
- MySQL
- Node.js 14+
- npm/yarn

### Backend (Spring Boot)

1. Depoyu klonlayın:
   ```bash
   git clone https://github.com/abdullahtopall/BlogHub.git
   ```

2. MySQL veritabanını oluşturun:
   ```sql
   CREATE DATABASE quest-app;
   ```

3. `application.properties` dosyasında veritabanı bağlantı ayarlarını yapın.

4. Maven ile projeyi derleyin ve çalıştırın:
   ```bash
   cd BlogHub
   ./mvnw spring-boot:run
   ```

### Frontend (React - İleriki Sürüm İçin)

1. Frontend klasörüne gidin:
   ```bash
   cd frontend
   ```

2. Bağımlılıkları yükleyin:
   ```bash
   npm install
   ```

3. Uygulamayı başlatın:
   ```bash
   npm start
   ```

4. Tarayıcınızda `http://localhost:3000` adresine gidin.

## 📚 API Endpoints

### Kullanıcı İşlemleri
- `GET /users` - Tüm kullanıcıları listele
- `GET /users/{userId}` - Belirli bir kullanıcıyı getir
- `POST /users` - Yeni kullanıcı oluştur
- `PUT /users/{userId}` - Kullanıcı bilgilerini güncelle
- `DELETE /users/{userId}` - Kullanıcıyı sil

### Kimlik Doğrulama
- `POST /auth/login` - Kullanıcı girişi
- `POST /auth/register` - Yeni kullanıcı kaydı

### Blog Gönderileri
- `GET /posts` - Tüm gönderileri listele
- `GET /posts/{postId}` - Belirli bir gönderiyi getir
- `GET /posts/category/{category}` - Kategoriye göre gönderileri filtrele
- `POST /posts` - Yeni gönderi oluştur
- `PUT /posts/{postId}` - Gönderiyi güncelle
- `DELETE /posts/{postId}` - Gönderiyi sil

### Yorumlar
- `GET /comments` - Tüm yorumları listele
- `GET /comments/{commentId}` - Belirli bir yorumu getir
- `POST /comments` - Yeni yorum oluştur
- `PUT /comments/{commentId}` - Yorumu güncelle
- `DELETE /comments/{commentId}` - Yorumu sil

### Beğeniler
- `GET /likes` - Tüm beğenileri listele
- `GET /likes/post/{postId}` - Gönderi beğenilerini getir
- `GET /likes/user/{userId}` - Kullanıcının beğenilerini getir
- `POST /likes` - Yeni beğeni oluştur
- `DELETE /likes/{likeId}` - Beğeniyi kaldır

## 📂 Proje Yapısı

```
BlogHub/
├── src/
│   ├── main/
│   │   ├── java/com/example/questapp/
│   │   │   ├── controllers/    # REST API controllers
│   │   │   ├── entities/       # JPA entity sınıfları
│   │   │   ├── repos/          # JPA repositories
│   │   │   ├── requests/       # Request modelleri
│   │   │   ├── services/       # Business logic
│   │   │   └── QuestappApplication.java   # Ana uygulama
│   │   └── resources/          # Yapılandırma dosyaları
└── frontend/  # İleriki sürümlerde React frontend
```

## 🤝 Katkıda Bulunma

Katkılarınızı bekliyoruz! İşte adımlar:

1. Projeyi forklayın 🔱
2. Yeni bir branch oluşturun: `git checkout -b yeni-ozellik`
3. Değişikliklerinizi commit edin: `git commit -m "Yeni özellik: XYZ eklendi"`
4. Branch'inizi push yapın: `git push origin yeni-ozellik`
5. Pull Request oluşturun!

## 📜 Lisans

Bu proje MIT Lisansı ile lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasını inceleyin.

## 👏 Teşekkürler

BlogHub'ı kullandığınız için teşekkür ederiz! Sorularınız, önerileriniz veya geri bildirimleriniz için issue açarak bize ulaşabilirsiniz.
