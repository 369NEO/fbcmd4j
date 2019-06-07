
        //Obtener NewsFeed
        System.out.println("\tObtener mis publicaciones\n");
        ResponseList<Post> feed = facebook.getFeed();
        for (Post post : feed) {
            System.out.println(post);
        } 
     