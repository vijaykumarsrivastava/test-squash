git checkout mybranch
git rebase -i mybranch~4 mybranch

-- replace "pick" with "f" and keep the first "pick' as it is.

--- don't pull the change.


git push -u origin +mybranch

1
2
3
4

