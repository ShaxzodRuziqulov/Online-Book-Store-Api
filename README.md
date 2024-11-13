# Online Book Store API

Bu loyiha online kitob do'koni uchun backend API bo'lib, Java, Spring Boot, PostgreSQL, JPA, va security (JWT asosida) texnologiyalaridan foydalanilgan. Bu API yordamida kitoblarni qo'shish, o'chirish, tahrirlash va qidirish kabi funksiyalarni amalga oshirishingiz mumkin.

## Texnologiyalar

- **Java**: Asosiy dasturlash tili
- **Spring Boot**: Tezkor backend va RESTful API yaratish uchun
- **Spring Security (JWT)**: Avtorizatsiya va autentifikatsiya uchun JWT asosida
- **JPA (Java Persistence API)**: Ma'lumotlar bazasi bilan ishlash
- **PostgreSQL**: Ma'lumotlar bazasi sifatida

## Xususiyatlari

- **JWT asosida foydalanuvchi autentifikatsiyasi**: Foydalanuvchilar ro'yxatdan o'tishi va tizimga kirishi mumkin.
- **CRUD operatsiyalari**: Kitoblar bilan ishlash (qo'shish, yangilash, o'chirish, qidirish).
- **Kategoriya boshqaruvi**: Kitoblarni kategoriyalar bo'yicha guruhlash imkoniyati.
- **Foydalanuvchilar uchun rollar**: Foydalanuvchilar turli rollarga (admin, user) ega bo'lishi mumkin.

## Loyihani ishga tushirish

1. **Talab qilinadigan dasturlarni o'rnating**:
   - Java 17
   - PostgreSQL
   - Maven

2. **Ma'lumotlar bazasini sozlang**:
   - PostgreSQLda yangi baza yarating (masalan: `online_book_store_db`).
   - `application.properties` faylida ma'lumotlar bazasi login va parollarini sozlang.

3. **Loyihani ishga tushiring**:
   - Terminal orqali loyihani boshlang:
     ```bash
     mvn spring-boot:run
     ```

## API Yo'llari

| Yo'l                       | Metod | Tavsif                          |
|----------------------------|-------|---------------------------------|
| `/api/auth/signup`         | POST  | Ro'yxatdan o'tish               |
| `/api/auth/login`          | POST  | Tizimga kirish                  |
| `/api/books`               | GET   | Barcha kitoblarni ko'rish       |
| `/api/books/{id}`          | GET   | Kitob haqida ma'lumot olish     |
| `/api/books`               | POST  | Yangi kitob qo'shish            |
| `/api/books/{id}`          | PUT   | Kitobni yangilash               |
| `/api/books/{id}`          | DELETE| Kitobni o'chirish               |

## Loyihani rivojlantirish

Agar siz loyihani rivojlantirishni xohlasangiz, quyidagi fikrlar sizga yordam beradi:
- **Ko'proq foydalanuvchi rollari**: Masalan, buyurtmalarni boshqarish uchun "menejer" rolini qo'shish.
- **Reyting va izohlar**: Kitoblarga baho berish va sharh yozish imkoniyatini qo'shish.
- **Buyurtmalar boshqaruvi**: Foydalanuvchilar buyurtmalarni yaratishi va kuzatishi mumkin.

## Muallif

Loyiha muallifi - Shaxzod Ro'ziqulov
