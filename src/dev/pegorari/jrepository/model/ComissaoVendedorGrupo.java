package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComissaoVendedorGrupo extends AbstractSankhyaEntity<ComissaoVendedorGrupo> {
   private BigDecimal codTipParc;
   private BigDecimal codVend;
   private BigDecimal comissao;
   private BigDecimal codGrupoProd;

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getComissao() {
        return comissao;
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
        this.comissao = comissao;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   @Override
   public String getTableName() {
        return "TGFCVG";
   }

   @Override
   public String getEntityName() {
        return "ComissaoVendedorGrupo";
   }

   @Override
   public ComissaoVendedorGrupo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        return this;
   }
}
