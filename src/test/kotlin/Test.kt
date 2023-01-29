import org.junit.Assert.*
import translationBankCard

class Test {

    @org.junit.Test
    fun translationBankCardVkPay() {
        val cardBank = "VkPay"
        val previous = 0
        val transfer = 5000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(5000, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimit() {
        val cardBank = "VkPay"
        val previous = 0
        val transfer = 50_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimitA() {
        val cardBank = "VkPay"
        val previous = 50_000
        val transfer = 1_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }

    @org.junit.Test
    fun translationBankCardLimitVisa() {
        val cardBank = "Visa"
        val previous = 1000
        val transfer = 600_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimitVisaA() {
        val cardBank = "Visa"
        val previous = 600_000
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimitVisaAdd() {
        val cardBank = "Visa"
        val previous = 0
        val transfer = 5_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(4963, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimitMir() {
        val cardBank = "Mir"
        val previous = 600_000
        val transfer = 1_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankCardLimitMirAdd() {
        val cardBank = "Mir"
        val previous = 0
        val transfer = 160_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankMir() {
        val cardBank = "Mir"
        val previous = 0
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(993, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCard() {
        val cardBank = "MasterCard"
        val previous = 0
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardA() {
        val cardBank = "MasterCard"
        val previous = 0
        val transfer = 76_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(75564, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardB() {
        val cardBank = "MasterCard"
        val previous = 76_000
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardC() {
        val cardBank = "MasterCard"
        val previous = 1000
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardLimit() {
        val cardBank = "MasterCard"
        val previous = 0
        val transfer = 760_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardLimitAdd() {
        val cardBank = "MasterCard"
        val previous = 760_000
        val transfer = 1_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankMasterCardLimitAddA() {
        val cardBank = "MasterCard"
        val previous = 0
        val transfer = 76_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(75564, rezult)
    }
    @org.junit.Test
    fun translationBankMaestro() {
        val cardBank = "Maestro"
        val previous = 0
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroC() {
        val cardBank = "Maestro"
        val previous = 1000
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroA() {
        val cardBank = "Maestro"
        val previous = 0
        val transfer = 76_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(75564, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroB() {
        val cardBank = "Maestro"
        val previous = 76_000
        val transfer = 1000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(1000, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroLimit() {
        val cardBank = "Maestro"
        val previous = 0
        val transfer = 760_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroLimitAdd() {
        val cardBank = "Maestro"
        val previous = 860_000
        val transfer = 1_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_LIMIT, rezult)
    }
    @org.junit.Test
    fun translationBankMaestroLimitAddA() {
        val cardBank = "Maestro"
        val previous = 0
        val transfer = 76_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(75564, rezult)
    }
    @org.junit.Test
    fun translationBankUnionPay() {
        val cardBank = "UnionPay"
        val previous = 0
        val transfer = 1_000
        val rezult = translationBankCard(cardBank, previous, transfer)
        assertEquals(ERROR_TYPE, rezult)
    }
}