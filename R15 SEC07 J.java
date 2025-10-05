
protected PermissionCollection getPermissions(CodeSource cs) {
  PermissionCollection pc = super.getPermissions(cs);
  // Allow exit from the VM anytime
  pc.add(new RuntimePermission("exitVM"));
  return pc;
}