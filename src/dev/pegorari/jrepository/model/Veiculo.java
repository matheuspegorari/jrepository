package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Veiculo extends AbstractSankhyaEntity<Veiculo> {
   public BigDecimal getCorDenatran() {
        return this.getVo().asBigDecimal("CORDENATRAN");
   }

   public void setCorDenatran(BigDecimal corDenatran) {
        markAsChanged("CORDENATRAN", corDenatran);
   }

   public String getCorFab() {
        return this.getVo().asString("CORFAB");
   }

   public void setCorFab(String corFab) {
        markAsChanged("CORFAB", corFab);
   }

   public String getDescrEmpParc() {
        return this.getVo().asString("DESCR_EMP_PARC");
   }

   public void setDescrEmpParc(String descrEmpParc) {
        markAsChanged("DESCR_EMP_PARC", descrEmpParc);
   }

   public String getDistEixos() {
        return this.getVo().asString("DISTEIXOS");
   }

   public void setDistEixos(String distEixos) {
        markAsChanged("DISTEIXOS", distEixos);
   }

   public String getEmiteExped() {
        return this.getVo().asString("EMITEEXPED");
   }

   public void setEmiteExped(String emiteExped) {
        markAsChanged("EMITEEXPED", emiteExped);
   }

   public String getEmpParc() {
        return this.getVo().asString("EMPPARC");
   }

   public void setEmpParc(String empParc) {
        markAsChanged("EMPPARC", empParc);
   }

   public String getEspecieTipo() {
        return this.getVo().asString("ESPECIETIPO");
   }

   public void setEspecieTipo(String especieTipo) {
        markAsChanged("ESPECIETIPO", especieTipo);
   }

   public BigDecimal getEspVei() {
        return this.getVo().asBigDecimal("ESPVEI");
   }

   public void setEspVei(BigDecimal espVei) {
        markAsChanged("ESPVEI", espVei);
   }

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public String getMarcaModelo() {
        return this.getVo().asString("MARCAMODELO");
   }

   public void setMarcaModelo(String marcaModelo) {
        markAsChanged("MARCAMODELO", marcaModelo);
   }

   public String getMarcaPlaca() {
        return this.getVo().asString("MARCAPLACA");
   }

   public void setMarcaPlaca(String marcaPlaca) {
        markAsChanged("MARCAPLACA", marcaPlaca);
   }

   public BigDecimal getMaxLotacao() {
        return this.getVo().asBigDecimal("MAXLOTACAO");
   }

   public void setMaxLotacao(BigDecimal maxLotacao) {
        markAsChanged("MAXLOTACAO", maxLotacao);
   }

   public String getNumMotor() {
        return this.getVo().asString("NUMMOTOR");
   }

   public void setNumMotor(String numMotor) {
        markAsChanged("NUMMOTOR", numMotor);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public String getPlaca() {
        return this.getVo().asString("PLACA");
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
   }

   public String getPotencia() {
        return this.getVo().asString("POTENCIA");
   }

   public void setPotencia(String potencia) {
        markAsChanged("POTENCIA", potencia);
   }

   public String getProprio() {
        return this.getVo().asString("PROPRIO");
   }

   public void setProprio(String proprio) {
        markAsChanged("PROPRIO", proprio);
   }

   public String getRenavam() {
        return this.getVo().asString("RENAVAM");
   }

   public void setRenavam(String renavam) {
        markAsChanged("RENAVAM", renavam);
   }

   public BigDecimal getRestricao() {
        return this.getVo().asBigDecimal("RESTRICAO");
   }

   public void setRestricao(BigDecimal restricao) {
        markAsChanged("RESTRICAO", restricao);
   }

   public String getSerial() {
        return this.getVo().asString("SERIAL");
   }

   public void setSerial(String serial) {
        markAsChanged("SERIAL", serial);
   }

   public String getTipFormFrete() {
        return this.getVo().asString("TIPFORMFRETE");
   }

   public void setTipFormFrete(String tipFormFrete) {
        markAsChanged("TIPFORMFRETE", tipFormFrete);
   }

   public String getTipInt() {
        return this.getVo().asString("TIPINT");
   }

   public void setTipInt(String tipInt) {
        markAsChanged("TIPINT", tipInt);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getTipoCombust() {
        return this.getVo().asBigDecimal("TIPOCOMBUST");
   }

   public void setTipoCombust(BigDecimal tipoCombust) {
        markAsChanged("TIPOCOMBUST", tipoCombust);
   }

   public BigDecimal getTipVei() {
        return this.getVo().asBigDecimal("TIPVEI");
   }

   public void setTipVei(BigDecimal tipVei) {
        markAsChanged("TIPVEI", tipVei);
   }

   public String getViaTransp() {
        return this.getVo().asString("VIATRANSP");
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
   }

   public BigDecimal getVlrDeprecMensal() {
        return this.getVo().asBigDecimal("VLRDEPRECMENSAL");
   }

   public void setVlrDeprecMensal(BigDecimal vlrDeprecMensal) {
        markAsChanged("VLRDEPRECMENSAL", vlrDeprecMensal);
   }

   public BigDecimal getVlrSegMensal() {
        return this.getVo().asBigDecimal("VLRSEGMENSAL");
   }

   public void setVlrSegMensal(BigDecimal vlrSegMensal) {
        markAsChanged("VLRSEGMENSAL", vlrSegMensal);
   }

   public String getVoltagem() {
        return this.getVo().asString("VOLTAGEM");
   }

   public void setVoltagem(String voltagem) {
        markAsChanged("VOLTAGEM", voltagem);
   }

   public BigDecimal getAnoFabric() {
        return this.getVo().asBigDecimal("ANOFABRIC");
   }

   public void setAnoFabric(BigDecimal anoFabric) {
        markAsChanged("ANOFABRIC", anoFabric);
   }

   public BigDecimal getAnoMod() {
        return this.getVo().asBigDecimal("ANOMOD");
   }

   public void setAnoMod(BigDecimal anoMod) {
        markAsChanged("ANOMOD", anoMod);
   }

   public String getAntt() {
        return this.getVo().asString("ANTT");
   }

   public void setAntt(String antt) {
        markAsChanged("ANTT", antt);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public String getCombustivel() {
        return this.getVo().asString("COMBUSTIVEL");
   }

   public void setCombustivel(String combustivel) {
        markAsChanged("COMBUSTIVEL", combustivel);
   }

   public BigDecimal getCondVei() {
        return this.getVo().asBigDecimal("CONDVEI");
   }

   public void setCondVei(BigDecimal condVei) {
        markAsChanged("CONDVEI", condVei);
   }

   public String getCondVin() {
        return this.getVo().asString("CONDVIN");
   }

   public void setCondVin(String condVin) {
        markAsChanged("CONDVIN", condVin);
   }

   public String getCor() {
        return this.getVo().asString("COR");
   }

   public void setCor(String cor) {
        markAsChanged("COR", cor);
   }

   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public String getChassis() {
        return this.getVo().asString("CHASSIS");
   }

   public void setChassis(String chassis) {
        markAsChanged("CHASSIS", chassis);
   }

   public String getCmKg() {
        return this.getVo().asString("CMKG");
   }

   public void setCmKg(String cmKg) {
        markAsChanged("CMKG", cmKg);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodEmpFolha() {
        return this.getVo().asBigDecimal("CODEMPFOLHA");
   }

   public void setCodEmpFolha(BigDecimal codEmpFolha) {
        markAsChanged("CODEMPFOLHA", codEmpFolha);
   }

   public BigDecimal getCodFormFrete() {
        return this.getVo().asBigDecimal("CODFORMFRETE");
   }

   public void setCodFormFrete(BigDecimal codFormFrete) {
        markAsChanged("CODFORMFRETE", codFormFrete);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodMarcaMod() {
        return this.getVo().asBigDecimal("CODMARCAMOD");
   }

   public void setCodMarcaMod(BigDecimal codMarcaMod) {
        markAsChanged("CODMARCAMOD", codMarcaMod);
   }

   public BigDecimal getCodMotorista() {
        return this.getVo().asBigDecimal("CODMOTORISTA");
   }

   public void setCodMotorista(BigDecimal codMotorista) {
        markAsChanged("CODMOTORISTA", codMotorista);
   }

   public BigDecimal getTara() {
        return this.getVo().asBigDecimal("TARA");
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
   }

   public String getTipoCar() {
        return this.getVo().asString("TIPOCAR");
   }

   public void setTipoCar(String tipoCar) {
        markAsChanged("TIPOCAR", tipoCar);
   }

   public String getTipoProp() {
        return this.getVo().asString("TIPOPROP");
   }

   public void setTipoProp(String tipoProp) {
        markAsChanged("TIPOPROP", tipoProp);
   }

   public String getTipoRod() {
        return this.getVo().asString("TIPOROD");
   }

   public void setTipoRod(String tipoRod) {
        markAsChanged("TIPOROD", tipoRod);
   }

   public String getCapPotCil() {
        return this.getVo().asString("CAPPOTCIL");
   }

   public void setCapPotCil(String capPotCil) {
        markAsChanged("CAPPOTCIL", capPotCil);
   }

   public String getCategoria() {
        return this.getVo().asString("CATEGORIA");
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
   }

   public String getAfericao() {
        return this.getVo().asString("AFERICAO");
   }

   public void setAfericao(String afericao) {
        markAsChanged("AFERICAO", afericao);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public String getTipoAfericao() {
        return this.getVo().asString("TIPOAFERICAO");
   }

   public void setTipoAfericao(String tipoAfericao) {
        markAsChanged("TIPOAFERICAO", tipoAfericao);
   }

   public String getCodEmbarcacao() {
        return this.getVo().asString("CODEMBARCACAO");
   }

   public void setCodEmbarcacao(String codEmbarcacao) {
        markAsChanged("CODEMBARCACAO", codEmbarcacao);
   }

   public String getNomeEmbarcacao() {
        return this.getVo().asString("NOMEEMBARCACAO");
   }

   public void setNomeEmbarcacao(String nomeEmbarcacao) {
        markAsChanged("NOMEEMBARCACAO", nomeEmbarcacao);
   }

   public BigDecimal getTipoEmbarcacao() {
        return this.getVo().asBigDecimal("TIPOEMBARCACAO");
   }

   public void setTipoEmbarcacao(BigDecimal tipoEmbarcacao) {
        markAsChanged("TIPOEMBARCACAO", tipoEmbarcacao);
   }

   public String getTipoVeiculo() {
        return this.getVo().asString("TIPOVEICULO");
   }

   public void setTipoVeiculo(String tipoVeiculo) {
        markAsChanged("TIPOVEICULO", tipoVeiculo);
   }

   public BigDecimal getCodParcPropAntt() {
        return this.getVo().asBigDecimal("CODPARCPROPANTT");
   }

   public void setCodParcPropAntt(BigDecimal codParcPropAntt) {
        markAsChanged("CODPARCPROPANTT", codParcPropAntt);
   }

   @Override
   public String getTableName() {
        return "TGFVEI";
   }

   @Override
   public String getEntityName() {
        return "Veiculo";
   }

   @Override
   public Veiculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
