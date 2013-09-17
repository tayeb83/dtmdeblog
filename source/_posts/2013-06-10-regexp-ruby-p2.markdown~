---
layout: post
title: التعابير النمطية و روبي - الجزء الثاني
date: 2013-06-10 19:49
comments: true
categories: ruby, regular expression, التعابير النمطية
---

هذا المقال هو تكملة للمقال السابق الذي بدأته حول التعابير النمطية في روبي. في هذا المقال سأبدأ بتكملة الأمثلة التي بدأتها سابقا ثم أنتقل إلى طريقة البحث و الاستبدال.

تكملة  الأمثلة
---------------------

التكرار الجشع : 
----------------------

<img src="/images/regexp_ruby/repetition_gourmande.png" title="ruby_Regexp_gorumande"/>


التجميع بواسطة الحاضنتين :
-----------------------------

<img src="/images/regexp_ruby/group_parentese.png" title="ruby_Regexp_grouping"/>

البدائل :
----------------

<img src="/images/regexp_ruby/replacement.png" title="ruby_Regexp_replacement"/>

المراسي anchors :
-------------------

المراسي عبارة عن أحرف أو بالأحرى رموز تساعد في حصر موقع التعبير النمطي :

<img src="/images/regexp_ruby/anchor.png" title="ruby_Regexp_anchor"/>


البحث و الاستبدال :
--------------------

من أهم الطرق أو العمليات الخاصة بالسلاسل في روبي العمليتين  sub و gsub. هاتين العمليتين تقومان بالبحث و الاستبدال على سلاسل الحروف باستعمال التعابير النمطية. أين sub تستبدل الحدوث الأول بينما gsub تستبدل كل الحوادث داخل السلسلة، لنأخذ أمثلة على ذلك :

<img src="/images/regexp_ruby/example_sub_gsub_1.png" title="ruby_Regexp_gsub1"/>

<img src="/images/regexp_ruby/results_sub_gsub_1.png" title="ruby_Regexp_gsub1_result"/>

في المثال الأول النتيجة موضحة في الصورة المرفقة أين قمنا بحذف التعليقات بالsub  بينما قمنا بحذف كل مل هو حرف ماعدا  الأرقام بواسطة gsub.


في المثال الثاني و بطريقتين مختلفتين باستعمال gsub فقط،  قمنابتكبير الحرف الأول من  كلمة tayeb إلى Tayeb.

<img src="/images/regexp_ruby/example_sub_gsub_2.png" title="ruby_Regexp_gsub_2"/>

<img src="/images/regexp_ruby/result_sub_gsub_2.png" title="ruby_Regexp_gsub2_result"/>












