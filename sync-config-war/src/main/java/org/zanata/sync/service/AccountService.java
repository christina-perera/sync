/*
 * Copyright 2016, Red Hat, Inc. and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.zanata.sync.service;

import javax.ejb.TransactionAttribute;

import org.zanata.sync.dto.RepoAccountDto;
import org.zanata.sync.dto.ZanataUserAccount;
import org.zanata.sync.model.RepoAccount;
import org.zanata.sync.model.ZanataAccount;

/**
 * @author Patrick Huang <a href="mailto:pahuang@redhat.com">pahuang@redhat.com</a>
 */
public interface AccountService {

    /**
     * Save current authenticated account as ZanataAccount entity (no op if
     * already saved).
     */
    @TransactionAttribute
    void saveAuthenticatedAccount();

    ZanataAccount getZanataAccountForCurrentUser();

    @TransactionAttribute
    RepoAccount saveRepoAccountForCurrentUser(RepoAccountDto repoAccount);
}
