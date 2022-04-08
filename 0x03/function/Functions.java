package function;

public class Functions {
   
	public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

	
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.save(user);
    }
      
    

    public void saveUser(User user){};
    
    

    public User saveUser(User user){
        if(user.isAdmin){
        user.setRole(user);
      }
        return userRepository.save(user);
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