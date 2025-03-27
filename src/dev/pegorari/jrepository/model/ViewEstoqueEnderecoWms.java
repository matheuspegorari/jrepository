package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ViewEstoqueEnderecoWms extends AbstractSankhyaEntity<ViewEstoqueEnderecoWms> {
   public String getExclConf() {
        return this.getVo().asString("EXCLCONF");
   }

   public void setExclConf(String exclConf) {
        markAsChanged("EXCLCONF", exclConf);
   }

   public String getLocalizacao() {
        return this.getVo().asString("LOCALIZACAO");
   }

   public void setLocalizacao(String localizacao) {
        markAsChanged("LOCALIZACAO", localizacao);
   }

   public BigDecimal getEntradasPend() {
        return this.getVo().asBigDecimal("ENTRADASPEND");
   }

   public void setEntradasPend(BigDecimal entradasPend) {
        markAsChanged("ENTRADASPEND", entradasPend);
   }

   public BigDecimal getEstDispVolPad() {
        return this.getVo().asBigDecimal("ESTDISPVOLPAD");
   }

   public void setEstDispVolPad(BigDecimal estDispVolPad) {
        markAsChanged("ESTDISPVOLPAD", estDispVolPad);
   }

   public String getBloqueado() {
        return this.getVo().asString("BLOQUEADO");
   }

   public void setBloqueado(String bloqueado) {
        markAsChanged("BLOQUEADO", bloqueado);
   }

   public BigDecimal getCodAreaSep() {
        return this.getVo().asBigDecimal("CODAREASEP");
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
   }

   public String getNomeAreaSep() {
        return this.getVo().asString("NOMEAREASEP");
   }

   public void setNomeAreaSep(String nomeAreaSep) {
        markAsChanged("NOMEAREASEP", nomeAreaSep);
   }

   public BigDecimal getEstoqueVolPad() {
        return this.getVo().asBigDecimal("ESTOQUEVOLPAD");
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        markAsChanged("ESTOQUEVOLPAD", estoqueVolPad);
   }

   public BigDecimal getSaidasPend() {
        return this.getVo().asBigDecimal("SAIDASPEND");
   }

   public void setSaidasPend(BigDecimal saidasPend) {
        markAsChanged("SAIDASPEND", saidasPend);
   }

   public String getDescrLocal() {
        return this.getVo().asString("DESCRLOCAL");
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getRefForn() {
        return this.getVo().asString("REFFORN");
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public String getDescrGrupoProd() {
        return this.getVo().asString("DESCRGRUPOPROD");
   }

   public void setDescrGrupoProd(String descrGrupoProd) {
        markAsChanged("DESCRGRUPOPROD", descrGrupoProd);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getPicking() {
        return this.getVo().asString("PICKING");
   }

   public void setPicking(String picking) {
        markAsChanged("PICKING", picking);
   }

   public String getMultiProd() {
        return this.getVo().asString("MULTIPROD");
   }

   public void setMultiProd(String multiProd) {
        markAsChanged("MULTIPROD", multiProd);
   }

   public String getExpedicao() {
        return this.getVo().asString("EXPEDICAO");
   }

   public void setExpedicao(String expedicao) {
        markAsChanged("EXPEDICAO", expedicao);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public String getEhDoca() {
        return this.getVo().asString("EHDOCA");
   }

   public void setEhDoca(String ehDoca) {
        markAsChanged("EHDOCA", ehDoca);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getNomeFantasia() {
        return this.getVo().asString("NOMEFANTASIA");
   }

   public void setNomeFantasia(String nomeFantasia) {
        markAsChanged("NOMEFANTASIA", nomeFantasia);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getProfundidade() {
        return this.getVo().asBigDecimal("PROFUNDIDADE");
   }

   public void setProfundidade(BigDecimal profundidade) {
        markAsChanged("PROFUNDIDADE", profundidade);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public BigDecimal getLargura() {
        return this.getVo().asBigDecimal("LARGURA");
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
   }

   public BigDecimal getAltura() {
        return this.getVo().asBigDecimal("ALTURA");
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
   }

   public BigDecimal getEstDisp() {
        return this.getVo().asBigDecimal("ESTDISP");
   }

   public void setEstDisp(BigDecimal estDisp) {
        markAsChanged("ESTDISP", estDisp);
   }

   public String getDescrProd() {
        return this.getVo().asString("DESCRPROD");
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
   }

   public BigDecimal getEntrPendVolPad() {
        return this.getVo().asBigDecimal("ENTRPENDVOLPAD");
   }

   public void setEntrPendVolPad(BigDecimal entrPendVolPad) {
        markAsChanged("ENTRPENDVOLPAD", entrPendVolPad);
   }

   public BigDecimal getSaidPendVolPad() {
        return this.getVo().asBigDecimal("SAIDPENDVOLPAD");
   }

   public void setSaidPendVolPad(BigDecimal saidPendVolPad) {
        markAsChanged("SAIDPENDVOLPAD", saidPendVolPad);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public String getEndMovVertical() {
        return this.getVo().asString("ENDMOVVERTICAL");
   }

   public void setEndMovVertical(String endMovVertical) {
        markAsChanged("ENDMOVVERTICAL", endMovVertical);
   }

   public Timestamp getDtRec() {
        return this.getVo().asTimestamp("DTREC");
   }

   public void setDtRec(Timestamp dtRec) {
        markAsChanged("DTREC", dtRec);
   }

   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtValMinExp() {
        return this.getVo().asTimestamp("DTVALMINEXP");
   }

   public void setDtValMinExp(Timestamp dtValMinExp) {
        markAsChanged("DTVALMINEXP", dtValMinExp);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public String getDescrEnd() {
        return this.getVo().asString("DESCREND");
   }

   public void setDescrEnd(String descrEnd) {
        markAsChanged("DESCREND", descrEnd);
   }

   public String getEndereco() {
        return this.getVo().asString("ENDERECO");
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
   }

   public BigDecimal getCodEndPai() {
        return this.getVo().asBigDecimal("CODENDPAI");
   }

   public void setCodEndPai(BigDecimal codEndPai) {
        markAsChanged("CODENDPAI", codEndPai);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public String getNomeParc() {
        return this.getVo().asString("NOMEPARC");
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getCodVolPad() {
        return this.getVo().asString("CODVOLPAD");
   }

   public void setCodVolPad(String codVolPad) {
        markAsChanged("CODVOLPAD", codVolPad);
   }

   @Override
   public String getTableName() {
        return "VGWEST";
   }

   @Override
   public String getEntityName() {
        return "ViewEstoqueEnderecoWms";
   }

   @Override
   public ViewEstoqueEnderecoWms fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
