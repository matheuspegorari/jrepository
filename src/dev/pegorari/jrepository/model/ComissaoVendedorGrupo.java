package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ComissaoVendedorGrupo implements SankhyaEntity<ComissaoVendedorGrupo> {

   private BigDecimal codTipParc;
   private BigDecimal codVend;
   private BigDecimal comissao;
   private BigDecimal codGrupoProd;

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getComissao() {
        return comissao;
   }

   public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   @Override
   public String getEntityName() {
        return "ComissaoVendedorGrupo";
   }

   @Override
   public ComissaoVendedorGrupo fromVO(DynamicVO vo) {
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        return this;
   }
}
