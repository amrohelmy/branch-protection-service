package io.simplersoftware.updatebranchprotection.service;

import io.simplersoftware.updatebranchprotection.message.ResponseProtectionMessage;

public interface BranchService {
    ResponseProtectionMessage setDefaultProtection(String repoName, String repoOwner );
}