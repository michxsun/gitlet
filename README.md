# gitlet

Classes:
Gitlet
CommandHandler
Branch

Gitlet (class):
  List of branches
  Current Branch
  Current ID
  
Branch (class):
  name
  Tree (Linked List?) of commits
  Current commit
  
Commit (class):
  Unique ID (probably Current ID of Gitlet + 1)
  Parent commit
  Child commits?
  Branches the commit is used by?
  List of Strings of unmodified files and modifed files?
  
  List of marked files. Separate class?
  
Add:
  add file to List of marked files in current commit

remove:
  remove file from Linkedlist of marked files
  
log:
  Iterate through commits inside current branch

find:
  grab branches from Gitlet and search for commit message.
  
Checkout:
  Branch: switch current branch inside Gitlet class
  
branch:
  add new branch to branches list inside Gitlet class.
  head commit should be the head commit of master. Pointers should point to the same commit
  
Merge <Branch 2>:
  for each file in Branch 2, check if not in list of modified files of current commit.
    If not in list of modified, copy to current branch and remove from list of unmodified files.
    
    Else, copy to current branch with extension .conflicted.
    
Rebase <Branch 2>:
  Iterate through commits in current branch and check who uses the commit. The first instance where
  both branch 2 and the current branch uses the same commit is where the split point would be.
  Therefore, one of the children of that commit will lead to the head of branch 2. 
  
