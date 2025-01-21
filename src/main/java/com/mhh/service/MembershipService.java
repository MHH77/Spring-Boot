package com.mhh.service;

import com.mhh.model.Membership;
import com.mhh.repository.MembershipRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MembershipService {
    private final MembershipRepository membershipRepository;

    public Membership addStudent(Membership membership) {
        return membershipRepository.save(membership);
    }

}
