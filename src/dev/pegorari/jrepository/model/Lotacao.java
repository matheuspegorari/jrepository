package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lotacao extends AbstractSankhyaEntity<Lotacao> {
   public BigDecimal getNuOcor() {
        return this.getVo().asBigDecimal("NUOCOR");
   }

   public void setNuOcor(BigDecimal nuOcor) {
        markAsChanged("NUOCOR", nuOcor);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtPosse() {
        return this.getVo().asTimestamp("DTPOSSE");
   }

   public void setDtPosse(Timestamp dtPosse) {
        markAsChanged("DTPOSSE", dtPosse);
   }

   public Timestamp getDtSaida() {
        return this.getVo().asTimestamp("DTSAIDA");
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
   }

   @Override
   public String getTableName() {
        return "TFPLOT";
   }

   @Override
   public String getEntityName() {
        return "Lotacao";
   }

   @Override
   public Lotacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
