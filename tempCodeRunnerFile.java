if(up.isEmpty()){
            System.out.println(p); 
            return;
        }
        char ch=up.charAt(0);
        substr(p,up.substring(1));
        substr(p+ch,up.substring(1));