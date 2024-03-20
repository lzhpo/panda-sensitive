/*
 * Copyright lzhpo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lzhpo.sensitive;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author lzhpo
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SensitiveConstants {

    /** 默认脱敏替换符 */
    public static final char REPLACER = '*';

    /** IPV4分隔符 */
    public static final char SEPARATOR_IPV4 = '.';

    /** IPV6分隔符 */
    public static final char SEPARATOR_IPV6 = ':';

    /** 不处理脱敏保留的标志 */
    public static final int NOP_KEEP = -1;

    /** 普通车牌号长度 */
    public static final int ORDINARY_CAR_LICENSE_LENGTH = 7;

    /** 新能源车牌号长度 */
    public static final int NEW_ENERGY_CAR_LICENSE_LENGTH = 8;

    /** 错误的银行卡号长度 */
    public static final int ERROR_BANK_CARD_LENGTH = 9;
}
