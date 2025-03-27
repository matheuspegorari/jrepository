package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasExecucoes extends AbstractSankhyaEntity<PrevisaoVendasExecucoes> {
   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDiretorio() {
        return this.getVo().asString("DIRETORIO");
   }

   public void setDiretorio(String diretorio) {
        markAsChanged("DIRETORIO", diretorio);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSLIPX";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasExecucoes";
   }

   @Override
   public PrevisaoVendasExecucoes fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
