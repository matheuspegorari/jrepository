package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaProduto extends AbstractSankhyaEntity<EtapaProduto> {
   private BigDecimal cicloProducao;
   private BigDecimal codEtapa;
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private String controle;
   private String _final;
   private String obrigatoria;
   private String ondeExec;
   private BigDecimal sequencia;
   private String unidCiclo;
   private BigDecimal variacao;

   public BigDecimal getCicloProducao() {
        return cicloProducao;
   }

   public void setCicloProducao(BigDecimal cicloProducao) {
        this.cicloProducao = cicloProducao;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public String getfinal() {
        return _final;
   }

   public void setfinal(String _final) {
        this._final = _final;
   }

   public String getObrigatoria() {
        return obrigatoria;
   }

   public void setObrigatoria(String obrigatoria) {
        this.obrigatoria = obrigatoria;
   }

   public String getOndeExec() {
        return ondeExec;
   }

   public void setOndeExec(String ondeExec) {
        this.ondeExec = ondeExec;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getUnidCiclo() {
        return unidCiclo;
   }

   public void setUnidCiclo(String unidCiclo) {
        this.unidCiclo = unidCiclo;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        this.variacao = variacao;
   }

   @Override
   public String getTableName() {
        return "TGFEPR";
   }

   @Override
   public String getEntityName() {
        return "EtapaProduto";
   }

   @Override
   public EtapaProduto fromVO(DynamicVO vo) {
        this.cicloProducao = vo.asBigDecimal("CICLOPRODUCAO");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this._final = vo.asString("_final");
        this.obrigatoria = vo.asString("OBRIGATORIA");
        this.ondeExec = vo.asString("ONDEEXEC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.unidCiclo = vo.asString("UNIDCICLO");
        this.variacao = vo.asBigDecimal("VARIACAO");
        return this;
   }
}
