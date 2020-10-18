# Rakuten-kai

(English Below)

楽天短期インターンシップでは、ウェブアプリエンジニアとして企画から開発までの一連の仕事を体験させていただきました。インターン生4人とメンター2人のチームで「楽天介」というウェブアプリを開発しました。このウェブアプリは困っている外国人と助けてあげたい日本人をマッチングさせるアプリです。開発には、JavaとSpring boot, Bootstrapを使っていました。チームでは、積極的にアイデア出しに挑戦して、最後に私のアイデアが採用されました。また、フロントエンドの部分を担当しました。[ウェブアプリの動作例は下に示しています](#example-of-the-web-app)。

This is a web application that we created in Rakuten Short Internship. This web app can help foreginers by matching foreginers who need help and Japanese who want to offer help. It is like a matching app, but japanese-foreginers version! The web app was developed in Java, HTML using frameworks like Spring Boot and Bootstrap. [See more below](#example-of-the-web-app) for the example of the web app on action!

### How to create a development env on Eclipse-Che
1. Open Workspaces page in Eclipse Che
2. Click "Add Workspace" button, then it New Workspace page appears
3. Click "Create & Proceed Editing" (at next triangle mark next to "CREATE & OPEN" button), then Workspaces page appears  
![](doc/add-workspace.png)
4. Click "Devfile" tab, and paste [rakutenkai-presentation.json](doc/rakutenkai-presentation.json) into "Workspace" textarea, after that "Success" message appears
5. Click "Open", then a workspace opens
6. Click "View" -> "My Workspace" on the menu, then "MY WORKSPACE" appears
![](doc/my-workspace.png)
7. Click "maven build", then the rakutenkai project will be built
8. Click "8080/tcp", then a instant server page appears
9. Get IP addresses of the instant server, and register them into a white-list of Geolocation API (ipinfodb.com)

### Example of the web app

Homepage
<img width="934" alt="(page1)ホームページ" src="https://user-images.githubusercontent.com/28722169/96363948-8fb6d500-1172-11eb-809c-babeaaba2fd3.png">


Search Result
<img width="934" alt="(page2)検索結果" src="https://user-images.githubusercontent.com/28722169/96363949-90e80200-1172-11eb-9205-fee84b9bfa28.png">


User Profile
<img width="840" alt="(page3)ユーザプロフィル" src="https://user-images.githubusercontent.com/28722169/96363951-92192f00-1172-11eb-9a80-adb6067ae0f2.png">


Messaging 
<img width="934" alt="(page4)メッセージ画面" src="https://user-images.githubusercontent.com/28722169/96363952-934a5c00-1172-11eb-8d25-8ce06d02edc3.png">


User's Appointment list
<img width="934" alt="(page5)アポイントメントリスト" src="https://user-images.githubusercontent.com/28722169/96363954-947b8900-1172-11eb-8202-e24f0e6c1b8b.png">
