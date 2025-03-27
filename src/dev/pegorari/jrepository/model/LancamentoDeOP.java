package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LancamentoDeOP extends AbstractSankhyaEntity<LancamentoDeOP> {
   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getReutilizar() {
        return this.getVo().asString("REUTILIZAR");
   }

   public void setReutilizar(String reutilizar) {
        markAsChanged("REUTILIZAR", reutilizar);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   @Override
   public String getTableName() {
        return "TPRLOP";
   }

   @Override
   public String getEntityName() {
        return "LancamentoDeOP";
   }

   @Override
   public LancamentoDeOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
