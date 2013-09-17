---
layout: post
title: بعض محركات البحث التي يمكن تثبيتها على موقعك
date: 2013-02-19 22:45
comments: true
categories: lucene, search engine, google, solr, elasticsearch, sphinx
---

ماهي محركات البحث التي يمكن استعمالها في موقعك :

من أهم الميزات التي يجب أن يتمتع بها أي موقع ويب اخباري هو محرك البحث الذي يحتويه الموقع. عندما يريد المستخدم طرح  سؤال أو البحث على مقال محدد فلا بد أن يقوم بالعملية بطريقة  سريعة و دقيقة في نفس الوقت.
الأمر sql على كامل النص يعتبر حلا سريعا و سهلا و لكن لا يعتبر بتاتا الحل الأمثل من ناحية الفعالية من جهة و من جهة ثانية أن الأمر ليس بالسهل لكتابة محرك بحث بواسطة الأوامر sql.
هذا المقال سيعطيكم لائحة لمجموعة من محركات البحث التي يمكنكم تثبيتها على خادم الويب الخاص بموقعكم. بالاضافة للAPI روبي التي تقوم بذلك. 
<!-- more -->
Google CSE
-----------------
هو عبارة عن خدمة تقدمها جوجل لفهرسة الصفحات الخاصة بموقع ويب معين و عرض النتائج في صفحة من اختيارنا بواسطة تصميم اختياري. رغم كونها الحل الأقل فعالية إلا أن هذا المحرك من أسهل المحركات تثبيتا و استعمالا.

<img src="/images/searchengine/google.jpg" title="google"/>

[https://github.com/vodafon/google_cse](https://github.com/vodafon/google_cse)

Solr
----------------
solr هو محرك البحث مفتوح المصدر الخاص ب 
apache سهل التثبيث خاصة على لينوكس يمكنكم استغلاله سريعا و لن تحتاجون إلى عمليات معقدة.

<img src="/images/searchengine/solr.jpg" title="solr"/>

[http://sunspot.github.com/](http://sunspot.github.com/)

sphinx
----------------
sphinx هو محرك بحث أخر مفتوح المصدر مع جميع الخصائص التي يتمتع بها solr ولكن التثبيث أصعب و يتطلب بعض المعرفة بالنظام و خصائصه.

<img src="/images/searchengine/sphinx.jpg" title="sphinx"/>

[http://pat.github.com/riddle/](http://pat.github.com/riddle/)
 
Elasticsearch 
-----------------
عبارة  عن محرك بحث مبني ب [lucene ](http://tayeb83.github.com/dtmdeblog/blog/2012/12/28/lucene-introduction/) مثله مثل solr هو لا يستعمل مخطط. الفهرسة  و البحث تتم عبر أوامر HTTP ب JSON لجعلها أكثر مرونة.

<img src="/images/searchengine/elasticsearch.jpg" title="UMLS"/>

[https://github.com/PoseBiz/stretcher](https://github.com/PoseBiz/stretcher)
