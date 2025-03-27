package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdiantamentoBaixaFinanceiro extends AbstractSankhyaEntity<AdiantamentoBaixaFinanceiro> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhMov() {
        return this.getVo().asTimestamp("DHMOV");
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
   }

   public BigDecimal getNuAntecipa() {
        return this.getVo().asBigDecimal("NUANTECIPA");
   }

   public void setNuAntecipa(BigDecimal nuAntecipa) {
        markAsChanged("NUANTECIPA", nuAntecipa);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getVlrTaxa() {
        return this.getVo().asBigDecimal("VLRTAXA");
   }

   public void setVlrTaxa(BigDecimal vlrTaxa) {
        markAsChanged("VLRTAXA", vlrTaxa);
   }

   @Override
   public String getTableName() {
        return "TGFABF";
   }

   @Override
   public String getEntityName() {
        return "AdiantamentoBaixaFinanceiro";
   }

   @Override
   public AdiantamentoBaixaFinanceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
