package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasExecucoes extends AbstractSankhyaEntity<PrevisaoVendasExecucoes> {
   private BigDecimal codExec;
   private BigDecimal codGrupo;
   private BigDecimal codProd;
   private String diretorio;
   private String tipo;

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
        this.codExec = codExec;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getDiretorio() {
        return diretorio;
   }

   public void setDiretorio(String diretorio) {
        markAsChanged("DIRETORIO", diretorio);
        this.diretorio = diretorio;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.setOriginalVO(vo);
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.diretorio = vo.asString("DIRETORIO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
