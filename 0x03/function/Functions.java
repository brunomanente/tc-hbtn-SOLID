package function;

public class Functions {
   
	public void saveCash(Income income, Expense expense){
        inRepo.save(income);
        outRepo.save(expense);
    }

    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }
      

    public void saveUser(User user){};

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);     
    }


    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){ 
        return versionService.getVersion();
    }

}