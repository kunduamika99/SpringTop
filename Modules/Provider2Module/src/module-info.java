module providertwo {
    requires service;
    provides com.service.ServiceRegistry with friend.Friend;

}