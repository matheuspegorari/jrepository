package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdiantamentoBaixaFinanceiro extends AbstractSankhyaEntity<AdiantamentoBaixaFinanceiro> {
   private BigDecimal codUsu;
   private Timestamp dhMov;
   private BigDecimal nuAntecipa;
   private BigDecimal nuFin;
   private BigDecimal vlrTaxa;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
        this.dhMov = dhMov;
   }

   public BigDecimal getNuAntecipa() {
        return nuAntecipa;
   }

   public void setNuAntecipa(BigDecimal nuAntecipa) {
        markAsChanged("NUANTECIPA", nuAntecipa);
        this.nuAntecipa = nuAntecipa;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public BigDecimal getVlrTaxa() {
        return vlrTaxa;
   }

   public void setVlrTaxa(BigDecimal vlrTaxa) {
        markAsChanged("VLRTAXA", vlrTaxa);
        this.vlrTaxa = vlrTaxa;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.nuAntecipa = vo.asBigDecimal("NUANTECIPA");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.vlrTaxa = vo.asBigDecimal("VLRTAXA");
        return this;
   }
}
