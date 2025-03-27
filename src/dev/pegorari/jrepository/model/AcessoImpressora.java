package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AcessoImpressora extends AbstractSankhyaEntity<AcessoImpressora> {
   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuPrinter() {
        return this.getVo().asBigDecimal("NUPRINTER");
   }

   public void setNuPrinter(BigDecimal nuPrinter) {
        markAsChanged("NUPRINTER", nuPrinter);
   }

   public BigDecimal getNuSvp() {
        return this.getVo().asBigDecimal("NUSVP");
   }

   public void setNuSvp(BigDecimal nuSvp) {
        markAsChanged("NUSVP", nuSvp);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSIAPRN";
   }

   @Override
   public String getEntityName() {
        return "AcessoImpressora";
   }

   @Override
   public AcessoImpressora fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
