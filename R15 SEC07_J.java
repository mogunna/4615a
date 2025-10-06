//Rule 15. Platform Security (SEC)
//Example SEC07-J. Call the superclass's getPermissions() method when writing a custom class loader
protected PermissionCollection getPermissions(CodeSource cs) {
  PermissionCollection pc = super.getPermissions(cs);
  // Allow exit from the VM anytime
  pc.add(new RuntimePermission("exitVM"));
  return pc;
}