# Profiling
[github.com/sharif-software-engineering-lab/Profiling](https://github.com/sharif-software-engineering-lab/Profiling)

<div dir="rtl">

## روال انجام آزمایش
### تمرین ۱
ابتدا ابزار 
YourKit
را نصب می‌کنیم. 
![1](Pictures/1-installing.png)
سپس با باز کردن و دنبال کردن لینک، کد فعال‌سازی دریافت می‌کنیم و برنامه را فعال می‌کنیم. 
![2](Pictures/2-activate.png)
![3](Pictures/3-email.png)
![4](Pictures/4-activated.png)
حال افزونه این برنامه را در 
IntelliJ IDEA
نصب می‌کنیم. 
![5](Pictures/5-plugin.png)
![6](Pictures/6-plugin.png)
با انتخاب دکمه 
Profiling 
در 
IDE 
عملیات را آغاز می‌کنیم. 
![7](Pictures/7-profiling.png)
![8](Pictures/8-temp.png)
همانطور که مشاهده می‌کنیم، تابع 
temp
اکثر ریسورس را مصرف می‌کند. 
![9](Pictures/9-temp.png)
با بررسی کد متوجه می‌شویم این تابع تاثیری بر روی برنامه ندارد. پس آن را صدا نمی‌زنیم. حال برنامه را مجددا بررسی می‌کنیم. 
![10](Pictures/10-profile.png)
![11](Pictures/11-profile.png)
![12](Pictures/12-profile.png)
مشاهده می‌کنیم برنامه به درستی با مصرف بهینه منابع اجرا می‌شود.

### تمرین ۲
برای این قسمت ما کلاس 
Fibonacci
را پیاده‌سازی کرده‌ایم که به صورت بازگشتی عدد ۴۶ام در سری فیبوناچی را حساب می‌کند.
![13](Pictures/13-fib.png)
حال به بررسی مصرف منابع اجرای این کد می‌پردازیم.
![14](Pictures/14-result.png)
![15](Pictures/15-result.png)
مشاهده می‌کنیم ۹ ثانیه از زمان پردازنده استفاده شده است. با بررسی بیشتر متوجه می‌شویم بیشتر زمان برنامه در تابع 
fib
سپری شده است. پس سعی می‌کنیم پیاده‌سازی این قسمت را بهتر کنیم.

پیاده‌سازی جدید این قسمت در شکل زیر قابل مشاهده است. در این پیاده‌سازی با استفاده از یک 
HashMap
تابع 
fib
بهینه شده است و نیازی ندارد چندین بار یک محاسبه تکراری را انجام دهد. 
![16](Pictures/16-new-fib.png)
با اجرا کردن مجدد کد مشاهده می‌کنیم زمان اجرا به کمتر از ۱ ثانیه رسیده است و به مراتب 
processing power 
بسیار کمتری صرف شده است. 
![17](Pictures/17-result.png)

</div>