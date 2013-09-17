---
layout: post
title: تثبيث الoctopress
date: 2013-02-09 18:06
comments: true
categories: rails, octopress, blog, github, git
---

في هذا المقال سوف أشرح  لكم كيفية تثبيث ال[octopress](http://octopress.org/) و استعماله مع الgithub كمحرك و مولد لصفحات تابثة لكم بطريقة  سهلة و بسيطة.

أول سؤال ماهو الOctorpress ؟ 
------------------------------
<!-- more -->
 هو عبارة عن منصة عمل طورها Brandon Mathis لل jekyll. للتدوين بالjekyll كان لابد من كتابة قوالب الhtml الخاصة، الCSS، الJavascript و إعداد التكوين الخاص بك. و لكن مع الOctopress كل هذا يصبح شفاف و المنصة تقوم بكل هذه الأعمال فور تثبيثها.
شخصيا الشيء الذي دفعني لاستعمال الOctopress هو فضولٌٌ أردت من خلاله التدرب و لمس كل مايتعلق بالgit و الgithub، و بالفعل فلقد ساعدني هذا الفضول إلى كسر حاجز الخوف بيني و بين أوامر الgit هذا من جانب أما الجانب الثاني هو امتلاك مدونة الكتابة فيها تشعرك كل يوم أنك فعلا hacker مع كل الأدوات التي استعملها و الأوامر التي أرسلها لكتابة مقال واحد، فرق سوف ترونه بلا شك لو استعملتم هذه المنصة.

تثبيث الOctopress :
----------------------
أول شيء قبل بدأ تثبيث المنصة هو إطلاعكم على مايجب تثبيثه قبل البدأ في تثبيث الOctopress.

1. تثبيث ال git : كنت قد شرحت عملية تثبيث الgit على نظام الubuntu في [مقال سابق ](http://tayeb83.github.com/dtmdeblog/blog/2012/07/08/gitinstallpart2/)  في مدونتي باستطاعتكم الإطلاع عليه و إن شئتم يمكنكم تتبع الخطوات المشروحة و بطريقة مفصلة حسب نوع النظام على الرابط [http://git-scm.com/book/en/Getting-Started-Installing-Git](http://git-scm.com/book/en/Getting-Started-Installing-Git).
2. تثبيث Ruby : نفس الشيئ كنت قد وضحت هذه العملية في مقال سابق و إن كانت الغاية هي تثبيث Ruby On Rails. و لكن أنصح لتثبيث الRuby  ولتسهيل التعامل مع النسخ المختلفة تثبيث  [RVM ](https://rvm.io/rvm/install)أو الRuby Version Manager و الذي سيسهل لكم بشكل لن تتصورونه تثبيث ال Ruby و استعمال النسخة التي تريدونها لذلك. 
3. إنشاء المستودع الخاص بكم على الgithub، تسجيل الدخول و إنشاء المستودع للمزيد يمكنكم الإطلاع على [مقال سابق 
](http://tayeb83.github.com/dtmdeblog/blog/2012/09/23/github/) في مدونتي. 
4. إنشاء ملف داخلي يحتوي المدونة، لنفرض أنكم سميتموه "modawinaty".

بعدها لم يبقى علينا سوى تثبيث المنصة على الملف الذي قمتم بإنشاءه، و ذلك باتباع الخطوات التالية :

1. git remote add octopress git://github.com/imathis/octopress.git
2. git pull octopress master
3. git checkout -b source
4. git remote add origin git@github.com:YourUserName/YourRepoName.git
5. git push origin source
6. rvm rvmrc trust و ذلك بعد تثبيث ال RVM
7. rvm reload
8. rake setup_github_pages في بعض الحالات يجب إرسال الأمرbundle install 
9. rake install
بعدها يجب الذهاب إلى الملف config.yml و تحديث السطر المقابل للroot باسم المستودع الذي أنشأتموه في الgithub في مثالنا : moudawinaty. 
10. Rake Generate
11. Rake Deploy

و لأنني أحبكم في الله، فلقد سجلت لكم فيديو مفصل لجميع الخطوات التي ستسمح لكم بإنشاء أول مدونة باستعمال الoctopress و تحميلها على الgithub، في الرايط التالي :


{% youtube Bi8t6EmePD0 %}














